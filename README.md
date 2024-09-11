## Endpoints

### Buscar brinquedo por ID

- **URL:** `https://cp4java-orclbd-production.up.railway.app/brinquedos/1`
- **Método:** `GET`
- **Descrição:** Retorna o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser buscado.
![image](https://github.com/user-attachments/assets/89a7e437-6cd7-416c-aff1-d346b732f218)


- **Resposta de Sucesso:**
  - **Código:** `200 OK`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Salvar brinquedo

- **URL:** `https://cp4java-orclbd-production.up.railway.app/brinquedos`
- **Método:** `POST`
- **Descrição:** Salva um novo brinquedo.
![image](https://github.com/user-attachments/assets/b035700d-aa6a-4c57-bf44-51d355cd41a4)



- **Resposta de Sucesso:**
  - **Código:** `200 OK`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Atualizar Brinquedos por Id

- **URL:** `https://cp4java-orclbd-production.up.railway.app/brinquedos/1`
- **Método:** `GET`
- **Descrição:** Atualiza o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser atualizado.
- **Resposta de Sucesso:**
  - **Código:** `200 OK`
![image](https://github.com/user-attachments/assets/6a0819e5-458f-4e0d-8ec3-6a19d6bf6d48)


- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.

### Deleta Brinquedos por Id

- **URL:** `https://cp4java-production.up.railway.app/brinquedos/1`
- **Método:** `GET`
- **Descrição:** Exclui o brinquedo pelo ID especificado.
- **Parâmetros de Caminho:**
  - `id` (int): ID do brinquedo a ser excluido.
![image](https://github.com/user-attachments/assets/2f4a8067-a39a-4a7e-9c17-9a96839933fa)


- **Resposta de Sucesso:**
  - **Código:** `204 Not Content`
- **Resposta de Erro:**
  - **Código:** `404 Not Found`
  - **Mensagem:** Not Found.
