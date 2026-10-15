# Carrom Online V4

Server-authoritative real-time multiplayer foundation for 1v1 and 2v2 Carrom.

## Included
- WebSocket room creation/joining
- Ready state and room roster
- Server-authoritative break lock + formation angle
- Server-authoritative deterministic shot simulation
- Server-side pocket/collision/foul bookkeeping
- 15-second turn validation
- 1v1 and 2v2 turn order
- Browser client that connects to the same host over WebSocket
- `/health` endpoint

## Run
```bash
npm install
npm start
```
Open `http://localhost:8080` in two or more browser windows/devices on the same network.

## Production
Deploy the Node server behind HTTPS and use WSS. Set `PORT` if the platform provides a port.

## Important
The deterministic physics is a foundation. Exact ICF edge-case enforcement (all Queen, due/penalty, touching/moving, board-out and match-end clauses) should be completed before claiming tournament-grade rules compliance.
