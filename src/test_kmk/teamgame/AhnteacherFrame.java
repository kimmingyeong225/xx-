package test_kmk.teamgame;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * 화면 구성 - 제목, (버튼(시작, 종료)), 설정
 * 이벤트 - 입력 키(키보드, 마우스) 입력 받기
 * 
 * paint (이미지)
 */
public class AhnteacherFrame extends JFrame {
	

	    private JButton startButton;
	    private JButton endButton;
	    private JLabel backgroundLabel;
	    

	    public AhnteacherFrame() {
	    	
	        setTitle("리듬 게임 시작 화면");
	        setSize(1600, 900); // 화면 사이즈
	        setLocationRelativeTo(null); // 화면 중앙에 프레임 위치
	        setDefaultCloseOperation(EXIT_ON_CLOSE); // 게임 창을 종료 시 프로그램 전체 종료
	        setLayout(null);
	        initComponents();
	        
	    }

	    private void initComponents() { 
	        // 배경 이미지 설정
	        ImageIcon backgroundImage = new ImageIcon("path/to/your/background/image.jpg");
	        backgroundLabel = new JLabel(backgroundImage);
	        backgroundLabel.setSize(1600,900 );// 수정
	        add(backgroundLabel);
	        
	        
	        // 제목 이미지를 위한 JLabel 생성
	       ImageIcon titleIcon = new ImageIcon("img/Titleloge.png");
	        JLabel titleLabel = new JLabel(titleIcon);
	        
	        titleLabel.setSize(titleIcon.getIconWidth(), titleIcon.getIconHeight());
	        int x = (1600 - titleIcon.getIconWidth()) / 2;
	        int y = 0;
	        titleLabel.setLocation(x, y);
	        add(titleLabel);
	        
	        // JLabel 위치와 크기 설정
	      //  titleLabel.setBounds(50, 50, titleIcon.getIconWidth(), titleIcon.getIconHeight());
	        //backgroundLabel.add(titleLabel);
	        
	        // 제목 이미지 위치 설정
	     


	        // 시작 버튼 설정
	        startButton = new JButton("시작하기");
	        startButton.setBounds(700, 650, 200, 50);
	        add(startButton);
	 
	      
	        
	        
	        
	        
  
	        // 버튼에 액션 추가해서 다음 화면으로 넘어갈 수 있도록 설계
	        startButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                //  메인 게임 화면으로 전환하는 코드 작성
	                System.out.println("게임 시작!");
	                
	                //게임 화면으로 전환 (다른 배경)
	                GamePanel gamepanel = new GamePanel();
	                //현재 시작 화면 숨기기 -> 다른 화면 띄우기
	               setVisible(false);
	                dispose();// 시작 화면 자원 해제
	            }
	        });
	   
	        

	        
	    
	
	        // 종료 버튼 설정
	        endButton = new JButton("종료하기");
	        endButton.setBounds(700, 720, 200, 50);
	        add(endButton);
	        endButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
	  
	        
	     // 설정 버튼 생성 및 위치 설정
	        JButton settingsButton = new JButton("설정");
	        settingsButton.setBounds(1300, 20, 100, 30);
	        backgroundLabel.add(settingsButton);

	        // 설정 버튼 이벤트 리스너 추가
	        settingsButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // 설정 창 생성
	                createSettingsWindow();
	            }            
	 
	        });
		     // 프레임을 화면 중앙에 배치
	        setLocationRelativeTo(null);
	        setVisible(true);
	    
	        
	    }
        // 설정 창 메소드
				private void createSettingsWindow() {
					//설정 창 프레임 생성
			        JFrame settingsFrame = new JFrame("설정");
			        settingsFrame.setSize(300, 200);
			        settingsFrame.setLayout(new FlowLayout());
			        settingsFrame.setLocationRelativeTo(null);

			        // 소리 조절을 위한 슬라이더 생성
			        JSlider volumeSlider = new JSlider(0, 100, 50);
			        volumeSlider.setMajorTickSpacing(10);
			        volumeSlider.setPaintTicks(true);
			        volumeSlider.setPaintLabels(true);

			        // 슬라이더 이벤트 리스너 추가
			        volumeSlider.addChangeListener(new ChangeListener() {
			            @Override
			            public void stateChanged(ChangeEvent e) {
			                // 소리 조절 로직
			                setVolume(volumeSlider.getValue());
			            }
			        });

			        // 설정 창에 슬라이더 추가
			        settingsFrame.add(volumeSlider);
			        settingsFrame.setVisible(true);
			    }

			    // 소리 조절을 위한 메소드
			    private void setVolume(int volume) {
			        // 예: 시스템 볼륨 또는 게임 내 볼륨 조절
			        // 실제 오디오 시스템과 연동되어야 됨
			    }
			    
			    
			    
					
				
			    // 코드 테스트
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            
	        	@Override
	            public void run() {
	                new AhnteacherFrame().setVisible(true);
	            }
	        });
	    }
	    
	}

	
