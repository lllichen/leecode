package ink.lichen.leecode.bytecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {


    public String simplifyPath(String path) {
//       Stack<String> stack = new Stack<>();
//       String[]paths = path.split("/+");
//       for (String s : paths){
//           if (s.equals("..")){
//               if (!stack.isEmpty()){
//                   stack.pop();
//               }
//
//           } else if (!s.equals(".") && !s.equals("")){
//               stack.push(s);
//           }
//       }
//
//       String res = "";
//       while (!stack.isEmpty()){
//           res = "/"+stack.pop()+res;
//       }
//       if (res.length() == 0){
//           return "/";
//       }
//       return res;

        List<String> dirs = new ArrayList<>();

        int dirStart = 0, len = path.length();
        while (dirStart < len) {
            // consume one slash and the string
            // find the index of directory
            while (dirStart < len && path.charAt(dirStart) == '/') dirStart++;

            int dirEnd = dirStart;
            while (dirEnd < len && path.charAt(dirEnd) != '/') dirEnd++;

            String dir = path.substring(dirStart, dirEnd);
            if (dir.equals(".")) {
            }
            else if (dir.equals("..")) {
                if (! dirs.isEmpty()){
                    dirs.remove(dirs.size() - 1);
                }
            } else {
                if (dir.length() > 0) {
                    dirs.add(dir);
                }
            }
            dirEnd++;
            dirStart = dirEnd;
        }

        // combine all dirs
        StringBuilder sb = new StringBuilder("/");
        for (int i = 0; i < dirs.size(); i++) {
            if (i == dirs.size() - 1) {
                sb.append(dirs.get(i));
            } else {
                sb.append(dirs.get(i)).append("/");
            }
        }

        return sb.toString();




    }

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        System.out.println(simplifyPath.simplifyPath("/a/./b/../../c"));
        System.out.println(simplifyPath.simplifyPath("/../"));
        System.out.println(simplifyPath.simplifyPath("///"));
    }
}
