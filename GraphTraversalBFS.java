import java.util.*;

public class GraphTraversalBFS {

    private final Map<String, List<String>> adj;

    public GraphTraversalBFS(Map<String, List<String>> adjList) {
        this.adj = adjList;
    }

    public boolean bfs(String start, String target) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            String node = queue.poll();
            System.out.println("Dikunjungi: " + node);

            if (node.equals(target)) {
                System.out.println("✅ Angka/Node " + target + " Ditemukan!");
                return true;
            }

            if (adj.containsKey(node)) {
                for (String neighbor : adj.get(node)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        System.out.println("❌ Angka/Node " + target + " Tidak Ditemukan.");
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

        GraphTraversalBFS graph = new GraphTraversalBFS(adjList);
        String startNode = "a1";
        String targetNode = "a7";

        System.out.println("--- 🔎 Pencarian BFS dari " + startNode + " untuk menemukan " + targetNode + " ---");
        graph.bfs(startNode, targetNode);
    }
}