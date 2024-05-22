## Endpoints

### Buscar brinquedo por ID

- **URL:** `/brinquedos/{id}`
- **Método:** `GET`
- **Descrição:** Retorna o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser buscado.
- **Resposta de Sucesso:**
  - **Código:** `200 OK`
  - **Corpo:**
    ```json
    {
      "id_brinquedo": 1,
      "nome": "Nome do Brinquedo",
      "descricao": "Descrição do Brinquedo",
      "preco": 29.99
    }
    ```
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Brinquedo não encontrado.

### Salvar brinquedo

- **URL:** `/brinquedos`
- **Método:** `POST`
- **Descrição:** Salva um novo brinquedo.
- **Corpo da Requisição:**
  ```json
  {
    "nome": "Nome do Brinquedo",
    "descricao": "Descrição do Brinquedo",
    "preco": 29.99
  }
