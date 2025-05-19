# Etapa 2 do projeto iniciado nas aulas de Projeto Orientado a Objetos
## Este projeto consiste na implementação de um conjunto de padrões
### Etapa 2: Extensão do Sistema com Novos Padrões de Projeto

  Objetivo
Você agora deverá evoluir o sistema existente com novas funcionalidades, incorporando os
seguintes padrões de projeto: Factory, Singleton, Proxy, Adapter, Facade e Decorator.

  Funcionalidades adicionais e padrões sugeridos
1. Suporte a múltiplos meios de transporte:
- Use Factory Method para instanciar objetos `TransportMode`
2. Gerenciador global de configurações:
- Use Singleton
3. Integração com serviço de mapas externo (simulado):
- Use Adapter
4. Cache de rotas recentes:
- Use Proxy
5. Painel simplificado de uso para o usuário final:
- Use Facade
6. Incremento visual e funcional na rota:
- Use Decorator
7. ____________________________________________________
- Use Observer

  Exemplo de uso (Java-like pseudocódigo)
SettingsManager config = SettingsManager.getInstance();
TransportFactory factory = new TransportFactory();
TransportMode transport = factory.create("bike");

MapService mapService = new ExternalMapAdapter(new LegacyMapProvider());
RouteService routeService = new CachedRouteProxy(new BaseRouteService(mapService));
RoutePlanner planner = new RoutePlanner();
planner.setStrategy(new EcoFriendlyRouteStrategy());
Route route = planner.planRoute("Centro", "Parque Ibirapuera", transport);
Route decoratedRoute = new TouristInfoDecorator(new SafetyAlertDecorator(route));
AppFacade facade = new AppFacade(planner, routeService, config);
facade.showRouteWithEnhancements("Centro", "Parque Ibirapuera", "bike");
  Tarefas
1. Modele e implemente a hierarquia `TransportMode` com Factory Method.
2. Crie `SettingsManager` como Singleton thread-safe.
3. Simule uma biblioteca de mapas externa e adapte-a com Adapter.
4. Implemente cache de rotas com Proxy.
5. Crie uma fachada que encapsula as operações de planejamento de rota.
6. Implemente decoradores para rotas com alertas, pontos turísticos, etc.
7. Diagrama UML
A seguir está a arquitetura geral com os padrões integrados:

7. Atualize o diagrama UML com a adição do Observer

![image](https://github.com/user-attachments/assets/3112edbb-4ae9-4ee0-b7a1-eaa4482186c0)



