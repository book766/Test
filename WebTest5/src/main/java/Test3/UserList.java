package Test3;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    //在线用户列表
    private List<String> OnlineUserList = new ArrayList<>();

    //在线用户数量
    private int OnlineUserNumber;

    /**
     * 添加在线用户
     * @param name
     */
    public void AddUser(String name){
        OnlineUserList.add(name);
    }

    /**
     * 删除在线用户
     * @param name
     */
    public void RemoveUser(String name){
        OnlineUserList.remove(name);
    }

    /**
     * 获取在线用户列表
     */
    public List<String> GetUserList(){
        return OnlineUserList;
    }

    /**
     * 增加在线用户数量
     */
    public void IncrNum(){
        OnlineUserNumber++;
    }

    /**
     * 减少在线用户数量
     */
    public void decrNum(){
        OnlineUserNumber--;
    }

    /**
     * 获取在线用户数量
     * @return
     */
    public int GetUserNum(){
        return OnlineUserNumber;
    }
}
