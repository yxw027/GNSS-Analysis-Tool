// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.abecerra.pvt_ephemeris_client.suplclient.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Choice;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Object;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.Asn1Tag;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStream;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.BitStreamReader;
import com.abecerra.pvt_ephemeris_client.suplclient.asn1.base.ChoiceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;


/**
 * 
 */
public  class Sensor_Error_r13 extends Asn1Choice {
  //

  private static final Asn1Tag TAG_Sensor_Error_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  private static final Map<Asn1Tag, Select> tagToSelection = new HashMap<>();

  private boolean extension;
  private ChoiceComponent selection;
  private Asn1Object element;

  static {
    for (Select select : Select.values()) {
      for (Asn1Tag tag : select.getPossibleFirstTags()) {
        Select select0;
        if ((select0 = tagToSelection.put(tag, select)) != null) {
          throw new IllegalStateException(
            "Sensor_Error_r13: " + tag + " maps to both " + select0 + " and " + select);
        }
      }
    }
  }

  public Sensor_Error_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_Sensor_Error_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_Sensor_Error_r13 != null) {
      return ImmutableList.of(TAG_Sensor_Error_r13);
    } else {
      return tagToSelection.keySet();
    }
  }

  /**
   * Creates a new Sensor_Error_r13 from encoded stream.
   */
  public static Sensor_Error_r13 fromPerUnaligned(byte[] encodedBytes) {
    Sensor_Error_r13 result = new Sensor_Error_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new Sensor_Error_r13 from encoded stream.
   */
  public static Sensor_Error_r13 fromPerAligned(byte[] encodedBytes) {
    Sensor_Error_r13 result = new Sensor_Error_r13();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  

  @Override protected boolean hasExtensionValue() {
    return extension;
  }

  @Override protected Integer getSelectionOrdinal() {
    return selection.ordinal();
  }

  @Nullable
  @Override
  protected ChoiceComponent getSelectedComponent() {
    return selection;
  }

  @Override protected int getOptionCount() {
    if (hasExtensionValue()) {
      return Extend.values().length;
    }
    return Select.values().length;
  }

  protected Asn1Object createAndSetValue(boolean isExtensionValue,
                                         int ordinal) {
    extension = isExtensionValue;
    if (isExtensionValue) {
      selection = Extend.values()[ordinal];
    } else {
      selection = Select.values()[ordinal];
    }
    element = selection.createElement();
    return element;
  }

  @Override protected ChoiceComponent createAndSetValue(Asn1Tag tag) {
    Select select = tagToSelection.get(tag);
    if (select == null) {
      throw new IllegalArgumentException("Unknown selection tag: " + tag);
    }
    element = select.createElement();
    selection = select;
    extension = false;
    return select;
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public Asn1Object getValue() {
    return element;
  }

  
  private static enum Select implements ChoiceComponent {
    
    $TargetServerErrorCauses_r13(Asn1Tag.fromClassAndNumber(2, 0),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Sensor_LocationServerErrorCauses_r13();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Sensor_LocationServerErrorCauses_r13.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    $TargetDeviceErrorCauses_r13(Asn1Tag.fromClassAndNumber(2, 1),
        true) {
      @Override
      public Asn1Object createElement() {
        return new Sensor_TargetDeviceErrorCauses_r13();
      }

      @Override
      Collection<Asn1Tag> getPossibleFirstTags() {
        return tag == null ? Sensor_TargetDeviceErrorCauses_r13.getPossibleFirstTags() : ImmutableList.of(tag);
      }

      @Override
      String elementIndentedString(Asn1Object element, String indent) {
        return toString() + " : " + element.toIndentedString(indent);
      }
    },
    
    ;

    @Nullable final Asn1Tag tag;
    final boolean isImplicitTagging;

    Select(@Nullable Asn1Tag tag, boolean isImplicitTagging) {
      this.tag = tag;
      this.isImplicitTagging = isImplicitTagging;
    }

    @Override
    public Asn1Object createElement() {
      throw new IllegalStateException("Select template error");
    }

    @Override
    @Nullable
    public Asn1Tag getTag() {
      return tag;
    }

    @Override
    public boolean isImplicitTagging() {
      return isImplicitTagging;
    }

    abstract Collection<Asn1Tag> getPossibleFirstTags();

    abstract String elementIndentedString(Asn1Object element, String indent);
  }
  
  

  public boolean isTargetServerErrorCauses_r13() {
    return !hasExtensionValue() && Select.$TargetServerErrorCauses_r13 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isTargetServerErrorCauses_r13}.
   */
  @SuppressWarnings("unchecked")
  public Sensor_LocationServerErrorCauses_r13 getTargetServerErrorCauses_r13() {
    if (!isTargetServerErrorCauses_r13()) {
      throw new IllegalStateException("Sensor_Error_r13 value not a TargetServerErrorCauses_r13");
    }
    return (Sensor_LocationServerErrorCauses_r13) element;
  }

  public void setTargetServerErrorCauses_r13(Sensor_LocationServerErrorCauses_r13 selected) {
    selection = Select.$TargetServerErrorCauses_r13;
    extension = false;
    element = selected;
  }

  public Sensor_LocationServerErrorCauses_r13 setTargetServerErrorCauses_r13ToNewInstance() {
      Sensor_LocationServerErrorCauses_r13 element = new Sensor_LocationServerErrorCauses_r13();
      setTargetServerErrorCauses_r13(element);
      return element;
  }
  
  

  public boolean isTargetDeviceErrorCauses_r13() {
    return !hasExtensionValue() && Select.$TargetDeviceErrorCauses_r13 == selection;
  }

  /**
   * @throws {@code IllegalStateException} if {@code !isTargetDeviceErrorCauses_r13}.
   */
  @SuppressWarnings("unchecked")
  public Sensor_TargetDeviceErrorCauses_r13 getTargetDeviceErrorCauses_r13() {
    if (!isTargetDeviceErrorCauses_r13()) {
      throw new IllegalStateException("Sensor_Error_r13 value not a TargetDeviceErrorCauses_r13");
    }
    return (Sensor_TargetDeviceErrorCauses_r13) element;
  }

  public void setTargetDeviceErrorCauses_r13(Sensor_TargetDeviceErrorCauses_r13 selected) {
    selection = Select.$TargetDeviceErrorCauses_r13;
    extension = false;
    element = selected;
  }

  public Sensor_TargetDeviceErrorCauses_r13 setTargetDeviceErrorCauses_r13ToNewInstance() {
      Sensor_TargetDeviceErrorCauses_r13 element = new Sensor_TargetDeviceErrorCauses_r13();
      setTargetDeviceErrorCauses_r13(element);
      return element;
  }
  

  private static enum Extend implements ChoiceComponent {
    
    ;
    @Nullable private final Asn1Tag tag;
    private final boolean isImplicitTagging;

    Extend(@Nullable Asn1Tag tag, boolean isImplicitTagging) {
      this.tag = tag;
      this.isImplicitTagging = isImplicitTagging;
    }

    public Asn1Object createElement() {
      throw new IllegalStateException("Extend template error");
    }

    @Override
    @Nullable
    public Asn1Tag getTag() {
      return tag;
    }

    @Override
    public boolean isImplicitTagging() {
      return isImplicitTagging;
    }

    String elementIndentedString(Asn1Object element, String indent) {
      throw new IllegalStateException("Extend template error");
    }
  }
  

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  private String elementIndentedString(String indent) {
    if (element == null) {
      return "null;\n";
    }
    if (extension) {
      return Extend.values()[selection.ordinal()]
          .elementIndentedString(element, indent + "  ");
    } else {
      return Select.values()[selection.ordinal()]
          .elementIndentedString(element, indent + "  ");
    }
  }

  public String toIndentedString(String indent) {
    return "Sensor_Error_r13 = " + elementIndentedString(indent) + indent + ";\n";
  }
}
