package test_kmk.teamgame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GamePanel  extends JFrame{
	 // 새로운 게임 화면을 위한 GamePanel 클래스 
        public GamePanel() {
            setTitle("리듬 게임");
            setSize(1600, 900);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            
            // startButton 을 클릭하면 GameStartScreen 창이 숨겨지고 GamePane 창이 나타남
            // 게임 패널에 컴포넌트 추가
            // 예: JLabel, JButton, Canvas 등
        }
        
        
        public static void main(String[] args) {
			new GamePanel();
		}
        
        
        
        
        
        
        
    }


