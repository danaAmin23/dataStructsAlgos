class Solution {
  public int lengthOfLongestSubstring(String s) {

    //trace

    //input : 'dvdf'
    //[dv]
    //[vdf]
    //[d,f]
    //[f] - omit

    //input : "pwwkew"
    //[p,w]
    //[w]
    //[w,k,e]
    //[k,e,w]
    //[e,w] 
    //[w] - omit

    ArrayList < Character > substring = new ArrayList < > ();

    int max = 0;

    for (int i = 0; i < s.length(); i++) {

      substring.clear();
      substring.add(s.charAt(i)); //[d]
      //System.out.print(s.charAt(i) + " : ");

      for (int j = i + 1; j < s.length(); j++) {

        if (substring.contains(s.charAt(j)) == false) {
          substring.add(s.charAt(j));

        } else {
          // System.out.println(substring.length());
          break;
        }

      }

      //    System.out.println(substring.size());

      if ((substring.size()) > max) {
        max = substring.size();
      }

      //     System.out.println();

    } //emd fpr 

    return max;

  }
}
