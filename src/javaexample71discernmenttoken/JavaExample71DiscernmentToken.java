
package javaexample71discernmenttoken;


public class JavaExample71DiscernmentToken {

    
    public static void main(String[] args) {
        String str = "He goes to the school everyday   ";
        
        System.out.println("Original string ("+str+")");
        
        String[] arr1= DiscernmentHelper.SpaceSplit(str);
        
        PrintArray(arr1);
        
        String[] arr2= DiscernmentHelper.BlankTokenSplit(str);
        
        PrintArray(arr2);
        
        String[] arr3= DiscernmentHelper.OLetterSplit(str);
        
        PrintArray(arr3);
        
        String[] arr4= DiscernmentHelper.OLetterSplitWithLimit1(str);
        
        PrintArray(arr4);
        
        String[] arr5= DiscernmentHelper.OLetterSplitWithLimit2(str);
        
        PrintArray(arr5);
        
        String[] arr6= DiscernmentHelper.OLetterSplitWithLimit3(str);
        
        PrintArray(arr6);
        
        String[] arr7= DiscernmentHelper.PatternSplit(str);
        
        PrintArray(arr7);
        
        System.out.println("-------------------------------------------------");
        
        String str2= "5A1B4C5D68E9FG0H3";
        
        System.out.println("The original string ("+str2+")");
        
        String[] arr8= DiscernmentHelper.PatternIntervalSplit(str2);
        
        PrintArray(arr8);
        
        System.out.println("-------------------------------------------------");
        
        String str3= String.valueOf(str);
        
        System.out.println("The original string ("+str3+")");
        
        String[] arr9= DiscernmentHelper.PatternIntervalSplit2(str3);
        
        PrintArray(arr9);
        
        System.out.println("-------------------------------------------------");
        
        String str4= String.valueOf(str);
        
        System.out.println("The original string ("+str4+")");
        
        String[] arr10= DiscernmentHelper.PatternIntervalSplit3(str4);
        
        PrintArray(arr10);
        
        System.out.println("-------------------------------------------------");
        
        String str5= "1 plus 2 plus 3 plus 4";
        
        System.out.println("The original string ("+str5+")");
        
        String[] arr11= DiscernmentHelper.StringAsSplitor(str5);
        
        PrintArray(arr11);
        
        System.out.println("-------------------------------------------------");
        
        String str6= "aaa bb  c    e f     ";
        
        String[] arr12= DiscernmentHelper.SpaceSplitWithDiscardingMultipleSplitors(str6);
        
        System.out.println("The original string ("+str6+")");
        
        PrintArray(arr12);
    }
    
    private static void PrintArray(String[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print("["+a[i]+"] ");
        }
        System.out.println();
    }
}
