    static int printnumber(int n){
        if(n == 0){
            return 0;
        }
        System.out.println(n);
        printnumber(n-1);
        // System.out.println(n);
        return 0;
    }