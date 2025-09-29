class A {
    int a[][] = {{1,2,3},{4,5,6}};
    int b[][] = {{7,8},{9,10},{11,12}};
    int c[][] = new int[2][2];
    
    void multiply() {
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                c[i][j]=0;
                for(int k=0; k<3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    
    void display() {
        System.out.println("Resultant Matrix:");
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        A obj = new A();
        obj.multiply();
        obj.display();
    }
}