package com.ragnar.primordialauthority.registry;

public final class TemplateSkills {
    private TemplateSkills() {
    }

    /*
     * When you are ready to add your first skill:
     *
     * import com.ragnar.primordialauthority.TensuraPrimordialAuthority;
     * import com.ragnar.primordialauthority.skill.ExampleBasicSkill;
     * import dev.architectury.registry.registries.RegistrySupplier;
     * import io.github.manasmods.manascore.skill.api.ManasSkill;
     * import io.github.manasmods.manascore.skill.impl.SkillRegistry;
     * import net.minecraft.resources.ResourceLocation;
     *
     * public static final RegistrySupplier<ManasSkill> EXAMPLE_BASIC = SkillRegistry.SKILLS.register(
     *         ResourceLocation.fromNamespaceAndPath(TensuraPrimordialAuthority.MODID, "example_basic"),
     *         ExampleBasicSkill::new
     * );
     *
     * You can use the progress examples the same way:
     *
     * public static final RegistrySupplier<ManasSkill> EXAMPLE_PROGRESS_UNIQUE = SkillRegistry.SKILLS.register(
     *         ResourceLocation.fromNamespaceAndPath(TensuraPrimordialAuthority.MODID, "example_progress_unique"),
     *         ExampleProgressUniqueSkill::new
     * );
     *
     * public static final RegistrySupplier<ManasSkill> EXAMPLE_PROGRESS_ULTIMATE = SkillRegistry.SKILLS.register(
     *         ResourceLocation.fromNamespaceAndPath(TensuraPrimordialAuthority.MODID, "example_progress_ultimate"),
     *         ExampleProgressUltimateSkill::new
     * );
     */
    public static void init() {
        // Add your ManasCore skill registrations here.
    }
}
