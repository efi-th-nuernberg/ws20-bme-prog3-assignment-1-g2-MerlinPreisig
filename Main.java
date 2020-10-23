class Main {
  public static void main(String[] args) {
    System.out.println("Hello Merlin!");
    teilbarDurchFünf();
    endetAufNeun();
    zahlVorgeanger();
  }

  public static void teilbarDurchFünf(){
    int x = 5;
    for (int i=0; i<201; i++){
      if (i%x==0){
        System.out.println(i + " durch 5 teilbar");
      }
    }
  }

  public static void endetAufNeun(){
    for (int j=0; j<201; j++){
        if ((j-9) % (10) == 0){
        System.out.println(j + " endet auf 9");
      
      }  
    }
  }

  public static void zahlVorgeanger(){
    for (int k=0; k<201; k++){
      int l = k-1;
      int x = k+l;
        if (x % 3 == 0){
        System.out.println(k + l + " addiert ergeben " + x + " und " + x + " ist durch 3 teilbar");
      }  
    }
  }
}