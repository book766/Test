package Test3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
    private Logger log = LoggerFactory.getLogger(User.class);

    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //HttpSessionBindingListener
    /**
     * 在线用户名单中添加登录用户，增加在线用户数量
     */
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        ServletContext application = session.getServletContext();

        UserList userlist = (UserList) application.getAttribute("onlineuserlist");

        if (userlist == null) {
            userlist = new UserList();
            application.setAttribute("onlineuserlist", userlist);
        }
        log.info(this.username + "记录已添加");
        userlist.AddUser(this.username);
        userlist.IncrNum();
    }

    /**
     * 在线用户名单中删除登出用户，减少在线用户数量
     */
    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        ServletContext application = session.getServletContext();

        UserList userlist = (UserList) application.getAttribute("onlineuserlist");
        log.info(this.username + "记录已删除");
        userlist.RemoveUser(this.username);
        userlist.decrNum();
    }
}
