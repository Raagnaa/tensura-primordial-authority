# Resources Template Guide

This template does not add real gameplay resources yet. Use these notes when
you create actual content.

## Language keys

Start from:

```text
src/main/resources/assets/authority/lang/en_us.json
```

Common keys you may add later:

```json
{
  "authority.skill.your_skill": "Your Skill",
  "authority.skill.your_skill.description": "Describe what the skill does.",
  "effect.authority.your_effect": "Your Effect",
  "authority.race.your_race": "Your Race",
  "authority.race.your_race.description": "Describe the race."
}
```

## Data resources

Only create data files when a system needs them. Useful folders may include:

```text
src/main/resources/data/authority/tags/
src/main/resources/data/authority/recipes/
src/main/resources/data/authority/loot_table/
```

For ManasCore race tags, create them only after you have real race ids.

## Client assets

Only create textures/models when you add visible content such as items,
blocks, icons, or custom UI.

```text
src/main/resources/assets/authority/textures/
src/main/resources/assets/authority/models/
```
