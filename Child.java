public class Child extends Parent {

    private int intChild;

    public int getIntChild() {
        return intChild;
    }

    public void setIntChild(int intChild) {
        this.intChild = intChild;
    }

    public void usefulMethod() {
        String importantObject = "i am an important string";
        System.out.println(importantObject);
    }

    @Override
    public void methodToOverride() {
        
    }
}