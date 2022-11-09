class WrapperClassTest{
  public static void main(String[] args) {
    byte b = 1;
    short s = 234;
    int i = 56789;
    long l = 1234567890L;

    Byte wrappedByte = b;
    Short wrappedShort = s;
    Integer wrappedInt = i;
    Long wrappedLong = l;
    System.out.println(wrappedByte.byteValue());
    System.out.println(wrappedShort.shortValue());
    System.out.println(wrappedInt.intValue());
    System.out.println(wrappedLong.longValue());
  }
}
