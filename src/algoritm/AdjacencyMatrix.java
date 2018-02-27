package algoritm;

import java.util.Scanner;

/**
 * @owner nurhidayat
 * @since 27/02/18.
 */
public class AdjacencyMatrix {

    private int[][] adjacencyMatrix;

    private AdjacencyMatrix(int vertices) {
        adjacencyMatrix = new int[vertices + 1][vertices + 1];
    }

    private void makeEdge(int to, int from, int edge) {
        try {
            adjacencyMatrix[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertices does not exist");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return adjacencyMatrix[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertices does not exist");
        }
        return -1;
    }


    public static void main(String[] args) {
        int v, e, count = 1, to, from;
        AdjacencyMatrix graph;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number of vertices: ");
            v = sc.nextInt();
            System.out.println("Enter the number of edges: ");
            e = sc.nextInt();
            graph = new AdjacencyMatrix(v);
            System.out.println("Enter the edges: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("The adjacency matrix for the given graph is: ");
            System.out.print(" ");
            for (int i = 1; i <= v; i++)
                System.out.print(i + " ");
            System.out.println();

        } catch (Exception E) {
            System.out.println("Somthing went wrong");
        }
        sc.close();
    }
}
