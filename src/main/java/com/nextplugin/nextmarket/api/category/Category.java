package com.nextplugin.nextmarket.api.category;

import com.nextplugin.nextmarket.api.category.icon.CategoryIcon;
import lombok.Builder;
import lombok.Data;
import org.bukkit.Material;

import java.util.List;

@Builder
@Data
public class Category {

    private final String id;
    private final String displayName;

    private final CategoryIcon icon;
    private final List<Material> allowedMaterials;

}
