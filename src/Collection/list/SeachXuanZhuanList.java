/**
 * Copyright (C), 2015-2019
 * FileName: SeachXuanZhuanList
 * Author:   kritio
 * Date:     2019/3/15 17:56
 * Description:  public int search(int[] nums, int target) {              }
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Collection.list;

/**
 * 〈一句话功能简述〉<br>
 * 〈 搜索旋转数组〉
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *
 * @author kritio
 * @create 2019/3/15
 * @since 1.0.0
 */
public class SeachXuanZhuanList {
    public int search(int[] nums, int target) {
        //实际上就是两个递增序列，依旧是二分法
        //只不过只在递增序列中二分
        if (nums.length == 0) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[low]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid == 0 ? mid : mid - 1;
                }
            }

        }
        return -1;
    }
}
/*
class Solution {
public:

    int dfs(vector<vector<int>>& grid, int x0, int y0){
        int n, m, sum=1;
        n = grid.size();
        m = grid[0].size();

        grid[x0][y0] = 0; //当前元素设置为0，避免再次搜索到
        int dir[4][2] = {{0,1},{0,-1},{1,0},{-1,0}};

        for(int i=0; i<4; i++){
            int x = x0 + dir[i][0];
            int y = y0 + dir[i][1];
            if(x>=0&&x<n&&y>=0&&y<m&&grid[x][y]==1)
                sum+=dfs(grid, x, y);
        }
        return sum;

    }
    int maxAreaOfIsland(vector<vector<int>>& grid)
    {
        int mx = 0, n, m;
        n = grid.size();
        m = grid[0].size();
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
            {
                if(grid[i][j] == 1)
                    mx = max(dfs(grid,i,j), mx);
            }
        return mx;
    }
};

 */