package ink.lichen.leecode.bytecode;

import java.util.Stack;

public class SimplifyPath {


    public String simplifyPath(String path) {
       Stack<String> stack = new Stack<>();
       String[]paths = path.split("/+");
       for (String s : paths){
           if (s.equals("..")){
               if (!stack.isEmpty()){
                   stack.pop();
               }

           } else if (!s.equals(".") && !s.equals("")){
               stack.push(s);
           }
       }

       String res = "";
       while (!stack.isEmpty()){
           res = "/"+stack.pop()+res;
       }
       if (res.length() == 0){
           return "/";
       }
       return res;
    }

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        System.out.println(simplifyPath.simplifyPath("/a/./b/../../c"));
        System.out.println(simplifyPath.simplifyPath("/../"));
        System.out.println(simplifyPath.simplifyPath("///"));
    }
}
