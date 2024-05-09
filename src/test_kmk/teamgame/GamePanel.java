package test_kmk.teamgame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JFrame {

	private JLabel backgroundLabel;
	private JLabel songLabel; // 노래 리스트

	// 버튼
	private JButton LeftButton; // 왼쪽 버튼
	private JButton RightButton; // 오른쪽 버튼
	private JButton StartButton; // 시작 버튼
	private JButton BackButton; // 뒤로가기 버튼
	private JButton endButton; // 종료 버튼
	
	private JPanel panel;

	// 새로운 게임 화면을 위한 GamePanel 클래스
	public GamePanel() {

		JPanel jPanel = new JPanel();

		initData();
		setInitLayot();
		addEventListener();

		setTitle("노래 선택 화면");
		setSize(1600, 900); // 수정 X
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(new BorderLayout());
		setLayout(null);
		setVisible(true); // 이때까지 이거 안 넣어서 창이 안 떴음... 잘 확인하기!

		add(jPanel); // 출력

		// startButton 을 클릭하면 GameStartScreen 창이 숨겨지고 GamePanel 창이 나타남
		// 게임 패널에 컴포넌트 추가
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("img/background.jpg"); // 이미지 수정!!!!!!!!
		backgroundLabel = new JLabel(icon);
		backgroundLabel.setSize(1600, 900);
		backgroundLabel.setLocation(0, 0);

		songLabel = new JLabel(new ImageIcon("img/song2.jpg"));
		songLabel.setSize(500, 500);
		songLabel.setLocation(550, 100);

//		// 노래 이미지, 버튼
//		ImageIcon songImage = new ImageIcon("img/song2.png"); // 노래 리스트 사진 수정!!!!!
//		songLabel = new JLabel(songImage);
//		songLabel.setBounds(500, 500, 200, 50); // 수정
//		backgroundLabel.add(songLabel); // background에 add 이용해서 노래 이미지 띄우기
//		

//		
//		
//		// 화면 전환하는 코드 나중에 입력 ( 게임 화면으로 )
//		
//		
//		// 왼쪽 버튼 설정
//		 LeftButton = new JButton("왼쪽");
//		 LeftButton.setBounds(200, 500, 200, 50); // 좌표 수정
//		 backgroundLabel.add(LeftButton); // 화면 위에 띄우기

	}

	public void setInitLayot() {
		setLayout(null);
		add(backgroundLabel);
		backgroundLabel.add(songLabel);
		setVisible(true);
	}
	
	public void addEventListener() {
		
	}
	
	

	public static void main(String[] args) {
		new GamePanel();

	}

}
