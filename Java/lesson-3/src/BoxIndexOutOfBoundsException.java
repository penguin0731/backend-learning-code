public class BoxIndexOutOfBoundsException extends RuntimeException{
    // 通过extends继承RuntimeException来描述这个类是一个异常
    // 另一个描述一个类是一个异常的方式是implements泛化
    public BoxIndexOutOfBoundsException() {}
    public BoxIndexOutOfBoundsException(String msg) {
        super(msg);
    }
}
