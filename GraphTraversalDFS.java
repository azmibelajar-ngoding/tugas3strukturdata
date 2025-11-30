import java.util.*;

public class GraphTraversalDFS {

    private final Map<String, List<String>> adj; 
    private final Set<String> visited; 

    public GraphTraversalDFS(Map<String, List<String>> adjList) {
        this.adj = adjList;
        this.visited = new HashSet<>();
    }

    public boolean dfs(String node, String target) {
        if (visited.contains(node)) {
            return false;
        }

        visited.add(node);
        System.out.println("Dikunjungi: " + node);

        if (node.equals(target)) {
            System.out.println("✅ Angka/Node " + target + " Ditemukan!");
            return true;
        }

        if (adj.containsKey(node)) {
            for (String neighbor : adj.get(node)) {
                if (dfs(neighbor, target)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Map<String, List<String>> adjList = new HashMap<>();
        adjList.put("a1", Arrays.asList("a2", "a3", "a4"));
        adjList.put("a2", Arrays.asList("a5", "a6"));
        adjList.put("a3", new ArrayList<>());
        adjList.put("a4", Arrays.asList("a7"));
        adjList.put("a5", Arrays.asList("a8"));
        adjList.put("a6", new ArrayList<>());
        adjList.put("a7", new ArrayList<>());
        adjList.put("a8", new ArrayList<>());

        GraphTraversalDFS graph = new GraphTraversalDFS(adjList);
        String startNode = "a1";
        String targetNode = "a7";

        System.out.println("--- 🔎 Pencarian DFS dari " + startNode + " untuk menemukan " + targetNode + " ---");
        boolean found = graph.dfs(startNode, targetNode);

        if (!found) {
            System.out.println("❌ Angka/Node " + targetNode + " Tidak Ditemukan.");
        }
    }
}