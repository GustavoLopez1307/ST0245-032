package Laboratorio1;


/**
 * Write a description of class Punto2 here.
 * 
 * @author Juan Andrés Arroyave y Gustavo López
 * @version (a version number or a date)
 */
public class Punto2
{
    public int factorial(int n) {
        if(n==0) return 1;
            
        return n*factorial(n-1);
    }

    public int BunnyEars(int bunnies) {

        if(bunnies==0) return 0;
    
        return 2+BunnyEars(bunnies-1);
    }
    
        public String noX(String str) {
            if(str.length()==0) return str;
  
            if(str.charAt(0)=='x')
            {
                return noX(str.substring(1)); 
    
            }   
  
            return str.charAt(0) + noX(str.substring(1));
    }
    
    
    public int count8(int n) {
        if(n==0) return 0;
  
            if(n%10==8) {
            if((n/10)%10==8) return 2+count8(n/10);
    
    
            return 1+count8(n/10);
    
        }

        return count8(n/10);
    }
    
    
    public int  powerN(int base,int n) {
        if(n==0) return 1;
        
        return base*powerN(base,n-1);
    }
    
    
    //Solución de problemas de la sección Recusion2 de CodingBat.
    
        public boolean groupSum6(int start, int[] nums, int target) {
            if(start>=nums.length) {
            return target==0;
        }
  
        if(nums[start]==6) {
         return groupSum6(start+1,nums,target-6);
        }  
  
  
        if(groupSum6(start+1,nums,target-nums[start])) {
         return true;
        }  
  
        if(groupSum6(start+1,nums,target)){
    
         return true;
       }
  
   
        return false;
    }

        public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start>=nums.length) {
            return target==0;
    
        }
  
        if(groupNoAdj(start+2,nums,target-nums[start])) {
            return true;
        }
  
  
        if(groupNoAdj(start+1,nums,target)) {
            return true;
        }

        return false;
    }
    
    
     public boolean groupSum5(int start, int[] nums, int target) {   
       
        if(start >= nums.length) return target == 0;
       
        if(nums[start]%5==0){
          
          target -= nums[start];
          
          if(start+1<nums.length && nums[start+1]==1) start++;
          
          return groupSum5(start+1, nums, target);
          
        }
        
        return groupSum5(start+1, nums, target - nums[start])||
        groupSum5(start+1, nums, target);
    }
    
    
        public boolean groupSumClump(int start, int[] nums, int target) {
  
            if(start>= nums.length){
                return target == 0;
            }
            else if(start+1 < nums.length &&nums[start]==nums[start+1]){
                return groupSumClump(start + 2, nums, target - (nums[start]+nums[start+1])) || 
                groupSumClump(start + 2, nums, target);
           }
            else {
                return groupSumClump(start + 1, nums, target - nums[start]) || 
                groupSumClump(start + 1, nums, target);

            }
        }
        
        public boolean split53(int[] nums) {
            if(nums.length == 0)
            return false;
            else
            return groupSum53(0, nums, 0, 0);
        }
 
        public boolean groupSum53(int i, int[] nums, int sum5, int sum3)
        {
            if(i == nums.length)
            return (sum5 == sum3);
 
            if(nums[i]%5==0){
                return groupSum53(i+1, nums, sum5 + nums[i], sum3);
            }
            else if(nums[i]%3==0){
                return groupSum53(i+1, nums, sum5, sum3 + nums[i]);
            }
 
            else
            return groupSum53( i+1, nums, sum5 + nums[i], sum3) || groupSum53(i+1, nums, sum5, sum3 + nums[i]);
        }
        //References :
        //Mirandaio-Codingbat-Recusion2-groupSumClump;
}
