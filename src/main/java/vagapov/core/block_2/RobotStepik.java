package vagapov.core.block_2;

/**
 * Код для отладки задачи на Робота со степика
 * Можете прям тут писать перед степиком
 * Ваш код вставляется на 70 строке текущего класса
 */
public class RobotStepik {
    public static void main(String[] args) {
        // Здесь задаются первоначальные значения стоянки робота, меняйте по своему усмотрению
        Robot robot = new Robot(0,0, Direction.DOWN);

        // Здесь задаются значения куда робот будет двигаться, тоже меняйте и перезапускайте класс main для тестирования
        int toX = -10; // точка Х
        int toY = 20;  // точка Y

        moveRobot(robot, toX, toY);

        //В консоли будет ввыведена строка по которой понятно куда отправили и куда пришел робот - проверка вашего кода
        System.out.printf("Send robot on point \"toX = %d\" and \"toY = %d\", and finally he is on \"toX = %d\" and \"toY = %d\"%n", toX, toY, robot.getX(), robot.getY());
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // Вставте сюда свой код
    }
}
