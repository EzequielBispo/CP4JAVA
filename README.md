## Endpoints

### Buscar brinquedo por ID

- **URL:** `http://cp3java-production.up.railway.app/brinquedos/1`
- **Método:** `GET`
- **Descrição:** Retorna o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser buscado.
- **Resposta de Sucesso:**
  - **Código:** `200 OK`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Salvar brinquedo

- **URL:** `https://cp3java-production.up.railway.app/brinquedos`
- **Método:** `POST`
- **Descrição:** Salva um novo brinquedo.
- **Corpo da Requisição:**
  ```json
{
	"id_brinquedo": 1,
	"nm_brinquedo": "Ben10",
	"tipo_brinquedo": "Boneco",
	"classe_brinquedo": "Infatil",
	"preco_brinquedo": 75,
	"tamanho_brinquedo": 0.3
}
    ```
- **Resposta de Sucesso:**
  - **Código:** `200 OK`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Atualizar Brinquedos por Id

- **URL:** `http://cp3java-production.up.railway.app/brinquedos/{id}`
- **Método:** `GET`
- **Descrição:** Atualiza o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser atualizado.
- **Resposta de Sucesso:**
  - **Código:** `200 OK`
  - **Corpo:**
    ```json
{
	"id_brinquedo": 1,
	"nm_brinquedo": "Ben 10 omniverse",
	"tipo_brinquedo": "Boneco",
	"classe_brinquedo": "Infatil",
	"preco_brinquedo": "75",
	"tamanho_brinquedo": 0.3,
	"_links": {
		"self": {
			"href": "http://cp3java-production.up.railway.app/brinquedos/1"
		}
	}
}
    ```
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Deleta Brinquedos por Id

- **URL:** `http://cp3java-production.up.railway.app/brinquedos/{id}`
- **Método:** `GET`
- **Descrição:** Exclui o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser excluido.
- **Resposta de Sucesso:**
  - **Código:** `200 OK`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.
