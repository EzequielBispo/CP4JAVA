## Endpoints

### Buscar brinquedo por ID

- **URL:** `http://cp3java-production.up.railway.app/brinquedos/1`
- **Método:** `GET`
- **Descrição:** Retorna o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser buscado.
![image](https://github.com/user-attachments/assets/620b9d9a-4c4f-4d5c-8d5a-83b4ddf7e852)

- **Resposta de Sucesso:**
  - **Código:** `200 OK`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Salvar brinquedo

- **URL:** `https://cp3java-production.up.railway.app/brinquedos`
- **Método:** `POST`
- **Descrição:** Salva um novo brinquedo.
![image](https://github.com/user-attachments/assets/916bb7a8-4b2d-4a74-b2fa-4f739038febf)

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
![image](https://github.com/user-attachments/assets/14416105-f1cc-45bc-bd6d-eee42603198f)

- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Deleta Brinquedos por Id

- **URL:** `http://cp3java-production.up.railway.app/brinquedos/{id}`
- **Método:** `GET`
- **Descrição:** Exclui o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser excluido.
![image](https://github.com/user-attachments/assets/bc915ded-6961-41d9-8816-3a75fee09f44)

- **Resposta de Sucesso:**
  - **Código:** `200 OK`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.
