
void main(){
    IO.println(String.format("Hello"));

    for (int i = 1; i <= 5; i++) {
        for(int j = 1; j <=i; j++) {
            IO.print("*");
        }
        IO.println("");
    }
}