class TestKeyGen {

  public static void main(String[] args) {
    String r = "Emmanuel Estrado Lario";

    char[] charArr = r.toCharArray();
    int asciiKey = 0, tmp = 0;

    for(int i=0; i<charArr.length; i++){
      tmp = ((int) charArr[i]);

      // if(tmp >= 65 || tmp <= 90)
      //   tmp = tmp - 66;
      // else if (tmp >= 97 || tmp <= 122)
      //   tmp = tmp - 96;
      // else if (tmp == 32)
      //   tmp = 0;

      asciiKey += tmp % 26;
    }

    System.out.println(asciiKey);


  }

}
