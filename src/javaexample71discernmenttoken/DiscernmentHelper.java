
package javaexample71discernmenttoken;


public class DiscernmentHelper {
    
    public static String[] SpaceSplit(String s)
    {
        String[] result = s.split(" ");
        return result;
    }
    
    public static String[] BlankTokenSplit(String s)
    {
        String[] result = s.split("\\s");
        return result;
    }
    
    public static String[] OLetterSplit(String s)
    {
        String[] result = s.split("o");
        return result;
    }
    
    public static String[] OLetterSplitWithLimit1(String s)
    {
        String[] result = s.split("o", -1);
        return result;
    }
    
    public static String[] OLetterSplitWithLimit2(String s)
    {
        String[] result = s.split("o", 2);
        return result;
    }
    
    public static String[] OLetterSplitWithLimit3(String s)
    {
        String[] result = s.split("o", 7);
        return result;
    }
    
    public static String[] PatternSplit(String s)
    {
        String[] result=s.split("[oe]");
        return result;
    }
    
    public static String[] PatternIntervalSplit(String s)
    {
        String[] result=s.split("[0-9]");
        return result;
    }
    
    // smal letters -- interval splitors
    public static String[] PatternIntervalSplit2(String s)
    {
        String[] result=s.split("[e-o]");
        return result;
    }
    
    // big letters -- interval splitors
    public static String[] PatternIntervalSplit3(String s)
    {
        String[] result=s.split("[E-O]");
        return result;
    }
    
    public static String[] StringAsSplitor(String s)
    {
        String[] result=s.split(" plus ");
        return result;
    }
    
    // dicard multiple successive splitor.
    public static String[] SpaceSplitWithDiscardingMultipleSplitors(String s)
    {
        String[] result=s.split(" +");
        return result;
    }
    
    // ---- For demonstration purposes -----------------------------------------
    
    public static String[] LetterSplitWithLimit(String str, String spliter, int limit)
    {
        String[] result = str.split(spliter, limit);
        return result;
    }
    
}
