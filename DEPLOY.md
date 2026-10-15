# Carrom Online — Production Deployment

## Option A: Render
1. Put this project in a GitHub repository.
2. In Render, create a Web Service from the repository.
3. Render can use `render.yaml`/the Dockerfile.
4. After deployment, check `/health`.
5. The WebSocket endpoint is the same host using `wss://`.

Example:
`https://YOUR-SERVICE.onrender.com/health`
`wss://YOUR-SERVICE.onrender.com`

## Option B: Fly.io
Use the included `fly.toml`, then deploy with the Fly CLI.

## Android
Set the WebSocket server URL in the client to the production `wss://...` endpoint, rebuild the APK/AAB, and test two phones on different networks.

## Production checklist
- HTTPS/WSS enabled
- `/health` returns OK
- Test room creation/join
- Test 1v1 and 2v2
- Test reconnect/disconnect
- Keep server authoritative for physics and score
- Add persistent accounts/database later if rankings, profiles or purchases are needed
