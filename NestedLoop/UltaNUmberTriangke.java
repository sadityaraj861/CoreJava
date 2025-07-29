package NestedLoop;

public class UltaNUmberTriangke {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.format("%02d ",++count); // 0 for putting zero in space. // 2d for 2 space .
            }
            System.out.println("");
        }
    }
}
