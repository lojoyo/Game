package game.view;

import game.controller.GameThread;

import javax.swing.*;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame {
    private KeyListener keyListener;
    private JPanel jPanel;

    public GameFrame(){
        init();
    }
    public void start(){
        //启动游戏线程
        GameThread thread=new GameThread();
        thread.start();
        //启动界面刷新线程
        if (jPanel instanceof Runnable){
            new Thread((Runnable) jPanel).start();
        }
        //
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("合金弹头114514");
        this.setSize(960, 540);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//居中
        this.addKeyListener(keyListener);
    }
    public void addListener(){
        if (keyListener!=null)
            this.setKeyListener(keyListener);
    }
    public void addJPanel(){
        if (jPanel!=null)
            this.setJPanel(jPanel);
    }
    public KeyListener getKeyListener() {
        return keyListener;
    }

    public void setKeyListener(KeyListener keyListener) {
        this.keyListener = keyListener;
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    public void setJPanel(JPanel jPanel) {
        this.jPanel = jPanel;
    }
}
