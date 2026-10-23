# Source Tree Advance — public incomplete source

This folder is a **public share scaffold** only.

It shows the plugin structure, models, settings and extension points.
**Core logic is intentionally incomplete**: it compiles, but it is not a working Git client.

## Plugin
- **Name:** Source Tree Advance
- **ID:** `com.akurupela.sta`
- **Supports:** every JetBrains IDE on the 2026.1 platform (build 261) or newer

## Features (of the full plugin)
- SourceTree-style Git client in a tool window: commit graph, File status, stage / unstage files and hunks
- Pull, push, fetch, branches, tags and stashes; Stop for running git commands
- Repository tabs: the project's repository plus up to 2 more, kept until closed, loaded when clicked
- Sign-in when a remote refuses: access token, username and password, Bearer token, SSH key / password, new SSH host keys
- Commit options: author, sign-off, signature, hooks; reformat / optimize imports; code analysis, TODO and run configuration checks
- Expanded diff window; flat green theme that follows the IDE's light or dark theme

## What is included
- Package and file layout
- Data models, settings state and public interfaces (simplified)
- Stub services, repository operations and UI classes
- `plugin.xml` and icons

## What is NOT included
- The git runner, output parsers and commit graph layout
- Sign-in handling (prompt matching, credential storage) and repository discovery
- Commit checks, dialogs, panels and theme painting
- Tests

## Build

Needs Gradle 9 or newer and JDK 21.

```bash
gradle buildPlugin
```

Downloads IntelliJ IDEA (`platformVersion` in `gradle.properties`) to compile against, or uses an installed IDE:

```bash
gradle buildPlugin -PlocalIde="/Applications/IntelliJ IDEA.app"
```

## License note
Incomplete public sample. Full source is private.
