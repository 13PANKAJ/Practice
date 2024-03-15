import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
          /*  public boolean checkInclusion(String s1, String s2) {
                int len1 = s1.length(), len2 = s2.length();
                if (len1 > len2) return false;

                int[] count = new int[26];
                for (int i = 0; i < len1; i++) {
                    count[s1.charAt(i) - 'a']++;
                    count[s2.charAt(i) - 'a']--;
                }
                if (allZero(count)) return true;

                for (int i = len1; i < len2; i++) {
                    count[s2.charAt(i) - 'a']--;
                    count[s2.charAt(i - len1) - 'a']++;
                    if (allZero(count)) return true;
                }

                return false;
            }*/
          public static boolean checkInclusion(String s1, String s2) {
              if (s1.length() > s2.length()) {
                  return false;
              }

              // Create character frequency maps for s1 and a sliding window in s2
              Map<Character, Integer> s1Map = new HashMap<>();
              Map<Character, Integer> s2Map = new HashMap<>();

              for (char c : s1.toCharArray()) {
                  s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
              }
              //System.out.println("printing S1 map first time fill");
            //  s1Map.forEach((x,y)-> System.out.println("print s1 map key and value ::"+x+"::"+y));
              for (int i = 0; i < s1.length(); i++) {
                  char c = s2.charAt(i);
                  s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);
              }

             s2Map.forEach((key,value)->System.out.println("key value is::"+key+"::"+value));
              System.out.println("************************");
              // Compare initial window
              if (s1Map.equals(s2Map)) {
                  return true;
              }

              // Slide the window through s2 and check for permutations of s1
              for (int i = s1.length(); i < s2.length(); i++) {  //i=3 ,i<5 s1map=pan ,s2 map=aap,s1=pan,s2 =aapna
                  char addedChar = s2.charAt(i);//n
                  char removedChar = s2.charAt(i - s1.length());//a

                  s2Map.put(addedChar, s2Map.getOrDefault(addedChar, 0) + 1);//(n,1)
              //    System.out.println("printing inside loop ");

                  if (s2Map.get(removedChar) == 1) {
                      s2Map.remove(removedChar);
                  } else {
                      s2Map.put(removedChar, s2Map.get(removedChar) - 1);
                  }
                 s2Map.forEach((key,value)->System.out.println("key is ::"+key+":: "+value));
                  System.out.println("======================");
                //  s1Map.forEach((key,value)->System.out.println("key is ::"+key+":: "+value));
                  if (s1Map.equals(s2Map)) {
                      return true;
                  }
              }

              return false;
          }
            public static void main(String[] args) {
                Solution solution = new Solution();
                String s1 = "ab";
                String s2 = "eidbaooo";
                boolean result = solution.checkInclusion(s1, s2);
               // System.out.println(result); // Should print true
               /* private List<String> getPalindrome(Stream<String> stream, int length) {
                    return stream.filter(s -> s.length() == length)
                            .filter(s -> s.compareToIgnoreCase(
                                    new StringBuilder(s).reverse().toString()) == 0)
                            .collect(Collectors.toList());
                }*/

                Stream.iterate(2,i->i*2).limit(5).collect(Collectors.toList()).forEach(System.out::println);
            }
        }















        /*public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }

            // Create character frequency maps for s1 and a sliding window in s2
            Map<Character, Integer> s1FreqMap = new HashMap<>();
            Map<Character, Integer> s2FreqMap = new HashMap<>();

            for (char c : s1.toCharArray()) {
                s1FreqMap.put(c, s1FreqMap.getOrDefault(c, 0) + 1);
            }

            for (int i = 0; i < s1.length(); i++) {
                char c = s2.charAt(i);
                s2FreqMap.put(c, s2FreqMap.getOrDefault(c, 0) + 1);
            }

            // Iterate through s2 using a sliding window
            for (int i = 0; i <= s2.length() - s1.length(); i++) {
                if (s1FreqMap.equals(s2FreqMap)) {
                    return true;
                }

                char leftChar = s2.charAt(i);
                s2FreqMap.put(leftChar, s2FreqMap.get(leftChar) - 1);
                if (s2FreqMap.get(leftChar) == 0) {
                    s2FreqMap.remove(leftChar);
                }

                if (i + s1.length() < s2.length()) {
                    char rightChar = s2.charAt(i + s1.length());
                    s2FreqMap.put(rightChar, s2FreqMap.getOrDefault(rightChar, 0) + 1);
                }
            }

            return false;
        }*/

     /*   public static boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }

            // Create character frequency maps for s1 and a sliding window in s2
            Map<Character, Integer> s1Map = new HashMap<>();
            Map<Character, Integer> s2Map = new HashMap<>();

            for (char c : s1.toCharArray()) {
                s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
            }

            for (int i = 0; i < s1.length(); i++) {
                char c = s2.charAt(i);
                s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);
            }

            // Compare initial window
            if (s1Map.equals(s2Map)) {
                return true;
            }

            // Slide the window through s2 and check for permutations of s1
            for (int i = s1.length(); i < s2.length(); i++) {
                char addedChar = s2.charAt(i);
                char removedChar = s2.charAt(i - s1.length());

                s2Map.put(addedChar, s2Map.getOrDefault(addedChar, 0) + 1);
                if (s2Map.get(removedChar) == 1) {
                    s2Map.remove(removedChar);
                } else {
                    s2Map.put(removedChar, s2Map.get(removedChar) - 1);
                }

                if (s1Map.equals(s2Map)) {
                    return true;
                }
            }

            return false;
        }


        public static void main(String[] args) {
            Solution solution = new Solution();
            String s1 = "abc";
            String s2 = "eidbaooo";
            boolean result = solution.checkInclusion(s1, s2);
            System.out.println(result); // Should print true
        }*/


/*    String s1 = "ad";
    String s2 = "alskfdjda";

    boolean b= s1.substring(s1).reverse();*/

