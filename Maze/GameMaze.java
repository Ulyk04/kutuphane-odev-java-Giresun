import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameMaze {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Maze");
        JLabel label = new JLabel("Задание: Найдите выход");
        Maze maze = new Maze();
        frame.add(label, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(maze);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        label.setFont(new Font("Arial", Font.BOLD, 13));
        label.setHorizontalAlignment(JLabel.CENTER);
    }
}

class Maze extends JPanel implements ActionListener{
    final private int[][] maze = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };
    private final int blockSize = 40;
    private final int numRows = maze.length;
    private final int numCols = maze[0].length;
    private Timer timer;
    private Player player;

    public Maze() {
        setPreferredSize(new Dimension(numCols * blockSize, numRows * blockSize));
        setFocusable(true);
        addKeyListener(new TAdapter());
        setBackground(Color.BLACK);

        player = new Player();
        timer = new Timer(25, this);
        timer.start();
    }



    private class Player {
        int x, y;

        Player() {
            x = 1 * blockSize;
            y = 1 * blockSize;


        }

        public void won() {
            JOptionPane.showMessageDialog(null, "You Won!", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
        }

        public void move(int dx, int dy) {
            int nextX = x + dx;
            int nextY = y + dy;

            int row = nextY / blockSize;
            int col = nextX / blockSize;

            if (maze[row][col] == 0) {
                x = nextX;
                y = nextY;
            }
            if(maze[row][col] == 5){
                won();
            }
        }

    }
    private class TAdapter extends KeyAdapter{
        public void keyPressed (KeyEvent e){
            int key = e.getKeyCode();

            if(key == KeyEvent.VK_LEFT){
                player.move(-blockSize, 0);
            }
            else if(key == KeyEvent.VK_RIGHT){
                player.move(blockSize, 0);
            }
            else if(key == KeyEvent.VK_UP){
                player.move(0,-blockSize);
            }
            else if(key == KeyEvent.VK_DOWN){
                player.move(0, blockSize);
            }
            repaint();
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int row = 0; row < maze.length; row++){
            for (int col = 0; col < maze[0].length; col++) {
                if(maze[row][col] == 1){
                    g.setColor(Color.BLUE);
                    g.fillRect(col * blockSize, row * blockSize, blockSize, blockSize);
                }
                if(maze[row][col] == 5){
                    g.setColor(Color.CYAN);
                    g.fillRect(col * blockSize, row * blockSize, blockSize, blockSize);
                }
            }

        }
        g.setColor(Color.YELLOW);
        g.fillOval(player.x, player.y, blockSize, blockSize);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}


