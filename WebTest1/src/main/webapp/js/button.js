//点击删除弹窗
function delinfo(){
    let button = document.getElementById("del"); //按钮

    button.onclick = function(){
        if(confirm("确定要删除吗？")){
            document.getElementById("text").style.visibility="hidden";
        } else{
            return false;
        }
    };
}

//点击恢复复原
function recinfo(){
    let button = document.getElementById("rec"); //按钮

    button.onclick = function(){
        document.getElementById("text").style.visibility="visible";
    };
}

