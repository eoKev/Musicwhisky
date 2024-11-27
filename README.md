Musicwhisky

O projeto Musicwhisky consiste em um aplicativo que permite o gerenciamento de dados, tais como cadastrar um artista, álbum e música, exibir as entidades cadastradas, além de poder atualizar os registros ou deletá-los. Também possui a implementação de uma api do Spotify que exibe alguns álbuns na tela inicial e permite fazer a consulta de artista na searchbar na parte superior da tela.
	O projeto conta com a modelagem MVVM (Model View e ViewModel) tendo três entidades, Artista, Álbum e Música, suas classes estão localizadas na pasta model. Cada uma tem sua classe DAO para a execução de seus respectivos CRUDs. Telas ViewModel para a mediação dos dados inseridos nas funções das views. As ViewModels contam cada uma com uma ViewModelFactory para criar a instância das ViewModels nas telas.

	
Conteúdo de cada pasta:

Model: Possui as classes Artistas, Álbum, Música, ArtistaComAlbum, AlbumComMusicas.

Dao: Possui as daos de cada classe, AlbumDao, ArtistaDao, MusicaDao.

Database: Tem a classe do AppDB.

View: Tem as classes para telas AppNavigation, TelaGerenciamento, TeleGerenciamentoAlbum, TeleGerenciamentoArtista, TeleGerenciamentoMusica, TelaInicial e PlaylistDetailsScree.

ViewModel: Classes com as viewModels de cada classe, AlbumVM, AlbumVMFactory, ArtistaVM, ArtistaVMFactory, MusicaVM, MusicaVMFactory e SpotifyVM.

Instruções para o uso:

Ao abrir o aplicativo você estará na tela inicial, a qual exibe uma barra de pesquisa que possibilita a pesquisa de algumas informações sobre artista, além de exibir 4 playlists geradas pela api do Spotify, ainda na tela inicial você tem o botão “Ir para Gerenciamento” que irá levá-lo a tela de que possibilita fazer o gerenciamento das entidades Artista, Álbum e Música. Caso não haja cadastros realizados ainda, é preciso fazer primeiro o do artista, para então, ser possível cadastrar um álbum ou uma música.


Na tela de cadastrado do Artista, basta apenas informa o Nome do artista ou da banda. Já na tela de cadastro de álbum você irá informar o nome do álbum, a quantidade de músicas que ele tem, a sua data de lançamento, o gênero e a qual artista ele pertence. E por fim na tela de cadastro de músicas, você irá informar o nome da música, a qual artista e álbum ela pertence e a sua duração (em segundos).
Para listar as entidades cadastradas, basta clicar no botão de “listar” e para ocultar a lista, clicar no botão “ocultar”.  Para deletar alguma entidade basta apenas informar o nome e clicar no botão “deletar”, caso a operação de deletar seja feita na tela de álbum, as músicas pertencentes a esse álbum também serão deletadas, para atualizar o processo é semelhante, basta informar o nome da entidade em sua respectiva tela de cadastro, editar as informações desejadas e então clicar no botão “Atualizar”.
Para sair das telas de cadastro, todas elas possuem um botão escrito voltar, com ele você irá retornar para a tela de seleção das telas de cadastro. Para voltar para a tela inicial do aplicativo pasta clicar no ícone de casa no canto superior esquerdo da tela.
	
Sobre a API:

A conexão com a API está sendo feita por meio do Retrofit, a autenticação é feita por meio da classe SpotifyAuth, onde é passado o cliente_id e cliente_secret. Os endpoints estão sendo estabelecidos no SpotifyApi.

Endpoints: 

v1/browse/featured-playlists – Usado para buscar playlists do Spotify.

playlists/{playlist_id} – Usado para buscar playlist por id.

search q type – Usado para fazer busca onde “q” é o parâmetro da busca (artista, álbum, playlist, etc...) e type é o tipo de entidade sendo buscada. 

artists/{id}/albums – Usado para buscar o álbum de determinado artista com base em seu id (não implementado)

albums/{id}/tracks – Busca as músicas de determinado álbum (não implementado) 

A classe SpotifyViewModel está sendo usada para intermediar as requisições da classe SpotifyApiClient para a tela PlaylistDetailScreen, onde são exibidas as playlists.
