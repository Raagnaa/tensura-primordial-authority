package com.ragnar.primordialauthority.registry;

import net.neoforged.bus.api.IEventBus;

public final class AuthorityTemplateRegistry {
    private AuthorityTemplateRegistry() {
    }

    public static void init(IEventBus modEventBus) {
        TemplateSkills.init();
        TemplateRaces.init();
        TemplateEffects.init(modEventBus);
        TemplateConfigs.init();
    }
}
