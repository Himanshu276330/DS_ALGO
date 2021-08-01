package DATA_STRUCTURE.Arrays;

public class ADV_L_16_RainWater_Trapping_Problem {
    public static void main(String[] args) {

        int []a={3,1,2,4,0,1,3,2};
        System.out.println(rainWaterTrap(a,a.length));
    }
    static int rainWaterTrap(int []a,int n){
        int []left=new int[n];
        left[0]=a[0];
        for (int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],a[i]);
        }
        int []right=new int[n];
        right[n-1]=a[n-1];
        for (int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],a[i]);
        }
        int waterTrap=0;
        for (int i=0;i<n;i++){
            waterTrap+=Math.min(left[i],right[i])-a[i];
        }
        return waterTrap;
    }
}
