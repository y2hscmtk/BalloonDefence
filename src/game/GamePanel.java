package game;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//캐릭터 선택과 아이디를 입력받는창
public class GamePanel extends JPanel {
    private GameFrame parent;//부모를 변수로 저장
    private ImageIcon icon = new ImageIcon("back.png");
    
    public GamePanel(GameFrame parent) {
        this.parent = parent;//받은 부모를 전역변수로 저장한다
        setLayout(null); //배치 관리자 제거
        this.setBackground(Color.gray);
        setSize(1500,900);
        //setBounds(0, 0, 1500,900);
        //2. 규칙 설명 버튼
        //=> 버튼을 누르면 프레임의 패널을 규칙설명패널로 이동, 기존 패널은 프레임에서 제거
        JButton backButton = new JButton(icon);
        backButton.setSize(icon.getIconWidth(),icon.getIconHeight());
        backButton.setLocation(500,325);
        backButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		parent.swapPanel(GameFrame.BEGINNING_PANEL);//부모의 컨텐트팬을 변경하기 위해 함수 호출
        	}
        });
        
        add(backButton);
        setVisible(true);
    }
}
