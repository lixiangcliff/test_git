package testing;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abc";
        String result = "";
        permutation1(s, result, s.length());

	}
	
	public static void permutation1(String str ,String result ,int len){
          if(result.length()==len){            //表示遍历完了一个全排列结果
           System.out.println(result);
          }
          else{
              for(int i=0;i<str.length();i++){
                  if(result.indexOf(str.charAt(i))<0){    //返回指定字符在此字符串中第一次出现处的索引。
                      //System.out.println("字母："+str.charAt(i));
                	  permutation1(str, result+str.charAt(i), len);
                      //result = result+str.charAt(i);
                      //permutation1(str, result, len);
                     //let's try it again!
                  }
              } 
          }
    }

}
