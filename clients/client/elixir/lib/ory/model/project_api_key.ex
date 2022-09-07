# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.ProjectApiKey do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :id,
    :name,
    :owner_id,
    :project_id,
    :value
  ]

  @type t :: %__MODULE__{
    :id => String.t,
    :name => String.t,
    :owner_id => String.t,
    :project_id => String.t | nil,
    :value => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.ProjectApiKey do
  def decode(value, _options) do
    value
  end
end
