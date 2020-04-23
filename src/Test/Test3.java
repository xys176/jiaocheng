package Test;
import java.io.*;
import java.util.*;
public class Test3 {
    final static int INF = Integer.MAX_VALUE;
    public static int[] prim(int[][]matrix){
        List <Integer> reachedVertexList = new ArrayList<Integer>();
        //选择顶点0为初始顶点，放入已触达顶点集合中
        reachedVertexList.add(0);
        //创建最小生成树数组，首元素设为-1
        int[] parents = new int[matrix.length];
        parents[0]=-1;
        //边的权重
        int weight;
 //源顶点下标
        int fromIndex = 0;
//目标顶点下标
        int toIndex =0;
        while(reachedVertexList.size() < matrix.length){
            weight =INF;
//在已触达的顶点中，寻找到达新顶点的最短边
            for(Integer vertexIndex :reachedVertexList){
                for(int i =0;i <matrix.length;i++){
                    if(!reachedVertexList.contains(i)){
                        if(matrix[vertexIndex][i]<weight){
                            fromIndex =vertexIndex;
                            toIndex =i;
                            weight =matrix[vertexIndex][i];
                        }
                    }
                }
            }
            //确定了权值最小的目标顶点，放入已触达顶点集合
            reachedVertexList.add(toIndex);

//放入最小生成树的数组
            parents[toIndex]=fromIndex;
        }
        return parents;
    }

    public static void main(String[]args){
        int[][]matrix =new int[][]{
                {0,2,2,1,INF,INF,INF},
                {2,0,INF,5,1,INF,INF},
                {2,INF,0,1,INF,2,INF},
                {1,5,1,0,1,6,5},
                {INF,1,INF,1,0,INF,3},
                {INF,INF,2,6,INF,0,10},
                {INF,INF,INF,INF,3,10,0}
        };
        int[]parents =prim(matrix);
        System.out.println(Arrays.toString(parents));
    }
}

