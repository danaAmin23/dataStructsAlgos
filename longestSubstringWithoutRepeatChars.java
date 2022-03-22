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

    //store chars that have been seen already 
    ArrayList < Character > substring = new ArrayList < > ();

    //init length
    int max = 0;

    for (int i = 0; i < s.length(); i++) {

      //clear out array list when duplicate char is found 
      substring.clear();
      
      //start new array list with the duplicate char 
      substring.add(s.charAt(i)); //[d]

      for (int j = i + 1; j < s.length(); j++) {

        if (substring.contains(s.charAt(j)) == false) {
          substring.add(s.charAt(j));

        } else {
          break;
        }

      }
      if ((substring.size()) > max) {
        max = substring.size();
      }
    } //end for 

    return max;

  }
}
