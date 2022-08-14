public class Box {
    int boxHeight, boxWidth, boxDepth;
    String boxBuilder;

    public Box(int width, int height, int depth){
        boxHeight=height;
        boxDepth=depth;
        boxWidth=width;

    }
    public Box(int width, int height, int depth, String builder){
        boxHeight=height;
        boxDepth=depth;
        boxWidth=width;
        boxBuilder=builder;
    }

    public String printMe(){
        return "Box built.\n\tWidth: "+boxWidth+ "\n\tHeight: "+boxHeight+ "\n\tDepth: "+boxDepth+ "\n\tBuilt by \n"+boxBuilder;
    }


    static public void main(String [] args){
        int width = 14;
        int height = 20;
        int depth = 40;
        String builder = "Margaret ";
        Box a = new Box(width, height, depth);
        System.out.println(a.printMe());
        Box b = new Box(width, height, depth, builder);
        System.out.println(b.printMe());
    }
}
