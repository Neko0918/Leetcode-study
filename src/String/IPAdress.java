/**
 * Copyright (C), 2015-2019
 * FileName: IPAdress
 * Author:   kritio
 * Date:     2019/3/9 17:03
 * Description: 还原ip地址
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package String;


import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈还原ip地址〉
 *
 * @author kritio
 * @create 2019/3/9
 * @since 1.0.0
 */
public class IPAdress {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        if (s.length()>3*4) {
            return res;
        }
        dfs(s, 0, "", res);
        return res;
    }

    public void dfs(String s, int n, String out, List<String> res) {
        if (n == 4) {
            if (s.isEmpty()) {
                res.add(out);
                return;
            }
        }
        for (int i = 1; i < 4; ++i) {
            if (i > s.length()) {
                break;
            }
            int val = Integer.valueOf(s.substring(0, i));
            if (val > 255 || i != String.valueOf(val).length()) {
                continue;
            }
            dfs(s.substring(i), n + 1, out + s.substring(0, i) + (n == 3 ? "" : "."), res);
        }
    }
}
/*
class Solution
 2 {
 3 public:
 4     string simplifyPath(string path)
 5     {
 6         stack<string> ss; // 记录路径名
 7         for(int i = 0; i < path.size(); )
 8         {
 9             // 跳过斜线'/'
10             while(i < path.size() && '/' == path[i])
11                 ++ i;
12             // 记录路径名
13             string s = "";
14             while(i < path.size() && path[i] != '/')
15                 s += path[i ++];
16             // 如果是".."则需要弹栈，否则入栈
17             if(".." == s && !ss.empty())
18                 ss.pop();
19             else if(s != "" && s != "." && s != "..")
20                 ss.push(s);
21         }
22         // 如果栈为空，说明为根目录，只有斜线'/'
23         if(ss.empty())
24             return "/";
25         // 逐个连接栈里的路径名
26         string s = "";
27         while(!ss.empty())
28         {
29             s = "/" + ss.top() + s;
30             ss.pop();
31         }
32         return s;
33     }
34 };

 */