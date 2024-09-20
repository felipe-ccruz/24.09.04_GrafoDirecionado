public class App {
    public static void main(String[] args) throws Exception {
         // Criando um grafo com 4 vértices
         Graph graph = new Graph(3);


        graph.automatic();


        // Imprime a matriz de conexão (matriz de adjacência)
        graph.printConnectMat();

        // Verifica se há loops no grafo
        graph.isLooping();

        // Verifica se há arestas paralelas no grafo
        graph.isParallel();
        
        // Verifica se há vertices isolados no grafo
        graph.isIsolated();

        // Imprime a conexão de todos os vértices
        graph.printVertexConnections();

        // Imprime a conexão de todas as arestas
        graph.printEdgeConnections();


        // Lista de Adjacência
        graph.adjacencyList();

        // Lista de arestas
        graph.edgeList();
    }
}
