class Main{
        public static void moon(){
                System.out.println("moonlight");
        }
        public static void winter( int temp){
                if(temp > 40){ //changed temp
                        System.out.print(" * ");
                        temp -= 1;
                        winter(temp);
               }
        }
        public static void main(String[] args) {
                winter( 35 );
                moon();
        }
}
