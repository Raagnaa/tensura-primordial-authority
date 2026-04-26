# Zones Template Notes

Use this checklist when you add your first zone system for `authority`.

## Suggested zone data

- `type`
- `dimension`
- `center`
- `radius`
- `active`

## First zone ideas

- Anti-skill zone (cancel activation in `SkillEvents.ACTIVATE_SKILL`)
- EP multiplier zone (for example `x1.5`, if Tensura exposes EP gain hooks)
- Corruption zone
- Purification zone

## Safe starting order

1. Start with one anti-skill zone.
2. Confirm server-side checks work.
3. Add client feedback (message/particles).
4. Expand to more zone types.
