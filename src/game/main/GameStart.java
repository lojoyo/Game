package game.main;

import game.view.GameFrame;
import game.view.GamePanel;


public class GameStart {
    public static void main(String[] args){
        //实例化
        GameFrame frame=new GameFrame();
        GamePanel panel=new GamePanel();
        //注入
        frame.setJPanel(panel);
        //加载
        frame.addJPanel();
        //启动
        frame.start();
    }
}
