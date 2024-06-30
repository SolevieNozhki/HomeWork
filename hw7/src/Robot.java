public class Robot {
   private int x;
   private  int y;

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x){
        if(x>0){
            this.x=x;
        }else{
            System.out.println("Ошибка. Число не должно быть меньше 0.");

        }
    }
    public void setY(int y) {
        if (y > 0) {
            this.y = y;
        } else {
            System.out.println("Ошибка. Число не должно быть меньше 0.");

        }
    }
    public void move(int x, int y) {
        /*while(this.x < x){
            System.out.println("Двигается по оси x от "+this.x+" до "+(++this.x));
        }
        while(this.y < y){
            System.out.println("Двигается по оси y от "+this.y+" до "+(++this.y));
        }*/
        this.x = print(this.x, x, "x");
        this.y = print(this.y, y, "y");
    }

   private int print(int start, int end, String axisName) {
        while (start < end) {
            System.out.println("Двигается по оси " + axisName + " от " + start + " до " + (++start));
        }
        return start;
    }
}